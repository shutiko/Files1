import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        //System.out.println("1. ==================================================");
        //1. ======================================================================================
        File src = new File("c://temp//games//src");
        File res = new File("c://temp//games//res");
        File savegames = new File("c://temp//games//savegames");
        File temp = new File("c://temp//games//temp");
        if (src.mkdir()) {
            //System.out.println("Каталог " + src.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + src.getAbsolutePath() + " создан \n");
        }
        if (res.mkdir()) {
            //System.out.println("Каталог " + res.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + res.getAbsolutePath() + " создан \n");
        }
        if (savegames.mkdir()) {
            //System.out.println("Каталог " + savegames.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + savegames.getAbsolutePath() + " создан \n");
        }
        if (temp.mkdir()) {
            //System.out.println("Каталог " + temp.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + temp.getAbsolutePath() + " создан \n");
        }
        //System.out.println("2. ==================================================");

        //2. ======================================================================================
        File srcMain = new File("c://temp//games//src//main");
        File srcTest = new File("c://temp//games//src//test");
        if (srcMain.mkdir()) {
            //System.out.println("Каталог " + srcMain.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + srcMain.getAbsolutePath() + " создан \n");
        }
        if (srcTest.mkdir()) {
            //System.out.println("Каталог " + srcTest.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + srcTest.getAbsolutePath() + " создан \n");
        }
        //System.out.println("3. ==================================================");

        //3. ======================================================================================
        File mainJava = new File("c://temp//games//src//main//Main.java");
        File utilsJava = new File("c://temp//games//src//main//Utils.java");
        try {
            if (mainJava.createNewFile()) {
                //System.out.println("Файл " + mainJava.getAbsoluteFile() + " был создан");
                stringBuilder.append("Файл " + mainJava.getAbsoluteFile() + " был создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            stringBuilder.append("Файл " + mainJava.getAbsoluteFile() + " не был создан - " + e.getMessage() + "\n");
        }
        try {
            if (utilsJava.createNewFile()) {
                //System.out.println("Файл " + utilsJava.getAbsoluteFile() + " был создан");
                stringBuilder.append("Файл " + utilsJava.getAbsoluteFile() + " был создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            stringBuilder.append("Файл " + utilsJava.getAbsoluteFile() + " не был создан - " + e.getMessage() + "\n");
        }
        //System.out.println("4. ==================================================");

        //4. ======================================================================================
        File resDrawables = new File("c://temp//games//res//drawables");
        File resVectors = new File("c://temp//games//res//vectors");
        File resIcons = new File("c://temp//games//res//icons");
        if (resDrawables.mkdir()) {
            //System.out.println("Каталог " + resDrawables.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + resDrawables.getAbsolutePath() + " создан \n");

        }
        if (resVectors.mkdir()) {
            //System.out.println("Каталог " + resVectors.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + resVectors.getAbsolutePath() + " создан \n");
        }
        if (resIcons.mkdir()) {
            //System.out.println("Каталог " + resIcons.getAbsolutePath() + " создан");
            stringBuilder.append("Каталог " + resIcons.getAbsolutePath() + " создан \n");
        }
        //System.out.println("5. ==================================================");

        //5. ======================================================================================
        File tempFile= new File("c://temp//games//temp//temp.txt");
        try {
            if (tempFile.createNewFile()) {
                //System.out.println("Файл " + tempFile.getAbsoluteFile() + " был создан");
                stringBuilder.append("Файл " + tempFile.getAbsoluteFile() + " был создан \n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            stringBuilder.append("Файл " + tempFile.getAbsoluteFile() + " не был создан - " + e.getMessage() + "\n");
        }
        String data = stringBuilder.toString();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter ("c://temp//games//temp//temp.txt"));
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

