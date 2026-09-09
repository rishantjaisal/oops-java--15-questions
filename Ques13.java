package Java_OOPS_Program;

import java.io.File;

class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:/Java/abc.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("Exists = " + file.exists());
            System.out.println("Is Directory = " + file.isDirectory());
            System.out.println("Is File = " + file.isFile());
            System.out.println("Name = " + file.getName());
            System.out.println("Absolute Path = " + file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}
