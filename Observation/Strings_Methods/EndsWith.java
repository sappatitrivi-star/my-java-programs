// String Method 13: endsWith()
// Real Application: File Type Check

class FileCheck {
    public static void main(String[] args) {

        String fileName = "JavaNotes.pdf";

        if (fileName.endsWith(".pdf")) {
            System.out.println("This is a PDF file");
        } else {
            System.out.println("This is not a PDF file");
        }
    }
}