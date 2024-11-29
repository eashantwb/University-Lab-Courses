package StudentData;

import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private Student student;
    private Course course;

    public Main() {
        frame = new JFrame("Student Data Management System");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width / 2;
        int height = screenSize.height / 2;

        frame.setSize(width, height);

        // Screen 1 - Welcome Page
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(new Color(75, 0, 130));
        welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.Y_AXIS));

        JLabel welcomeLabel = new JLabel("<html><h1>Student Data Management System</h1></html>", SwingConstants.CENTER);
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomeLabel.setForeground(Color.WHITE);
        welcomePanel.add(Box.createVerticalStrut(50)); // Add space at the top
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(Box.createVerticalStrut(30)); // Add space below the title

        JLabel teamLabel0 = new JLabel("<html><h3>Team Members</h3></html>", SwingConstants.CENTER);
        teamLabel0.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel0.setForeground(Color.WHITE);
        welcomePanel.add(teamLabel0);
        welcomePanel.add(Box.createVerticalStrut(50)); // Add space below the team members

        JLabel teamLabel1 = new JLabel("<html><p>Tawab Ibnul Eashan [ID - 0432410005101015]</p></html>", SwingConstants.CENTER);
        teamLabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel1.setForeground(Color.WHITE);
        welcomePanel.add(teamLabel1);
        welcomePanel.add(Box.createVerticalStrut(20));

        JLabel teamLabel2 = new JLabel("<html><p>Rehnuma Shaheed Rahi [ID - 0432410005101026]</p></html>", SwingConstants.CENTER);
        teamLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel2.setForeground(Color.WHITE);
        welcomePanel.add(teamLabel2);
        welcomePanel.add(Box.createVerticalStrut(20));

        JLabel teamLabel3 = new JLabel("<html><p>Lubna Akter Surove [ID - 0432410005101009]</p></html>", SwingConstants.CENTER);
        teamLabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel3.setForeground(Color.WHITE);
        welcomePanel.add(teamLabel3);
        welcomePanel.add(Box.createVerticalStrut(20));

        JLabel teamLabel4 = new JLabel("<html><p>Mojahidul Islam Rafel [ID - 0432410005101011]</p></html>", SwingConstants.CENTER);
        teamLabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
        teamLabel4.setForeground(Color.WHITE);
        welcomePanel.add(teamLabel4);
        welcomePanel.add(Box.createVerticalStrut(50));


        JButton continueButton = new JButton("Continue");
        continueButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        continueButton.addActionListener(e -> cardLayout.show(mainPanel, "StudentForm"));
        welcomePanel.add(continueButton);
        welcomePanel.add(Box.createVerticalStrut(50)); // Add space at the bottom

        mainPanel.add(welcomePanel, "Welcome");

        // Screen 2 - Student Form
        JPanel studentFormPanel = new JPanel();
        studentFormPanel.setBackground(new Color(138, 43, 226));
        studentFormPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setForeground(Color.WHITE);
        studentFormPanel.add(studentIdLabel, gbc);

        gbc.gridx = 1;
        JTextField studentIdField = new JTextField(20);
        studentFormPanel.add(studentIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE);
        studentFormPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(20);
        studentFormPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setForeground(Color.WHITE);
        studentFormPanel.add(departmentLabel, gbc);

        gbc.gridx = 1;
        JTextField departmentField = new JTextField(20);
        studentFormPanel.add(departmentField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setForeground(Color.WHITE);
        studentFormPanel.add(yearLabel, gbc);

        gbc.gridx = 1;
        JTextField yearField = new JTextField(20);
        studentFormPanel.add(yearField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> {
            student = new Student(Integer.parseInt(studentIdField.getText()), nameField.getText(), departmentField.getText(), Integer.parseInt(yearField.getText()));
            cardLayout.show(mainPanel, "CourseForm");
                });
        studentFormPanel.add(nextButton, gbc);

        mainPanel.add(studentFormPanel, "StudentForm");



        // Screen 3 - Course Form
        JPanel courseFormPanel = new JPanel();
        courseFormPanel.setBackground(new Color(221, 160, 221));
        courseFormPanel.setLayout(new GridBagLayout());
        GridBagConstraints gcc = new GridBagConstraints();
        gcc.fill = GridBagConstraints.HORIZONTAL;
        gcc.insets = new Insets(10, 10, 10, 10); // Add some padding

        gcc.gridx = 0;
        gcc.gridy = 0;
        JLabel courseIdLabel = new JLabel("Course ID:");
        courseIdLabel.setForeground(Color.WHITE);
        courseFormPanel.add(courseIdLabel, gcc);

        gcc.gridx = 1;
        JTextField courseIdField = new JTextField(20);
        courseFormPanel.add(courseIdField, gcc);

        gcc.gridx = 0;
        gcc.gridy = 1;
        JLabel courseNameLabel = new JLabel("Course Name:");
        courseNameLabel.setForeground(Color.WHITE);
        courseFormPanel.add(courseNameLabel, gcc);

        gcc.gridx = 1;
        JTextField courseNameField = new JTextField(20);
        courseFormPanel.add(courseNameField, gcc);

        gcc.gridx = 0;
        gcc.gridy = 2;
        JLabel creditHoursLabel = new JLabel("Credit Hours:");
        creditHoursLabel.setForeground(Color.WHITE);
        courseFormPanel.add(creditHoursLabel, gcc);

        gcc.gridx = 1;
        JTextField creditHoursField = new JTextField(20);
        courseFormPanel.add(creditHoursField, gcc);

        gcc.gridx = 0;
        gcc.gridy = 3;
        JLabel instructorNameLabel = new JLabel("Instructor Name:");
        instructorNameLabel.setForeground(Color.WHITE);
        courseFormPanel.add(instructorNameLabel, gcc);

        gcc.gridx = 1;
        JTextField instructorNameField = new JTextField(20);
        courseFormPanel.add(instructorNameField, gcc);

        gcc.gridx = 1;
        gcc.gridy = 4;
        gcc.gridwidth = 2;
        gcc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            course = new Course(courseIdField.getText(), courseNameField.getText(), Double.parseDouble(creditHoursField.getText()), instructorNameField.getText());
            Enrollment enrollment = new Enrollment(student, course);
            String email = Email.generateEmail(student.getStudentId());
            showEnrollmentDetails(enrollment, email);
        });
        courseFormPanel.add(submitButton, gcc);

        mainPanel.add(courseFormPanel, "CourseForm");



        // Add main panel to frame
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Show the welcome screen initially
        cardLayout.show(mainPanel, "Welcome");
    }


    // Screen 4 - Display Information
    private void showEnrollmentDetails(Enrollment enrollment, String email) {
        JPanel detailsPanel = new JPanel();
        detailsPanel.setBackground(new Color(186, 85, 211));
        detailsPanel.setLayout(new GridBagLayout());
        GridBagConstraints gcc = new GridBagConstraints();
        gcc.fill = GridBagConstraints.HORIZONTAL;
        gcc.insets = new Insets(10, 10, 10, 10); // Add some padding

        gcc.gridx = 0;
        gcc.gridy = 0;
        JLabel studentIdLabel = new JLabel("Student ID: " + enrollment.getStudent().getStudentId());
        studentIdLabel.setForeground(Color.WHITE);
        detailsPanel.add(studentIdLabel, gcc);

        gcc.gridy++;
        JLabel nameLabel = new JLabel("Name: " + enrollment.getStudent().getName());
        nameLabel.setForeground(Color.WHITE);
        detailsPanel.add(nameLabel, gcc);

        gcc.gridy++;
        JLabel departmentLabel = new JLabel("Department: " + enrollment.getStudent().getDepartment());
        departmentLabel.setForeground(Color.WHITE);
        detailsPanel.add(departmentLabel, gcc);

        gcc.gridy++;
        JLabel yearLabel = new JLabel("Year: " + enrollment.getStudent().getYear());
        yearLabel.setForeground(Color.WHITE);
        detailsPanel.add(yearLabel, gcc);

        gcc.gridy++;
        JLabel courseIdLabel = new JLabel("Course ID: " + enrollment.getCourse().getCourseId());
        courseIdLabel.setForeground(Color.WHITE);
        detailsPanel.add(courseIdLabel, gcc);

        gcc.gridy++;
        JLabel courseNameLabel = new JLabel("Course Name: " + enrollment.getCourse().getCourseName());
        courseNameLabel.setForeground(Color.WHITE);
        detailsPanel.add(courseNameLabel, gcc);

        gcc.gridy++;
        JLabel emailLabel = new JLabel("Email: " + email);
        emailLabel.setForeground(Color.WHITE);
        detailsPanel.add(emailLabel, gcc);

        gcc.gridy++;
        gcc.anchor = GridBagConstraints.CENTER;
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> frame.dispose());
        detailsPanel.add(closeButton, gcc);

        mainPanel.add(detailsPanel, "Details");
        cardLayout.show(mainPanel, "Details");
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
