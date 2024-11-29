package StudentData;


public interface Email {
    static String generateEmail(int studentId) {
        return "uits" + studentId + "@uits.edu.com";
    }
}

