package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File mainDirGames = new File ("F:\\Programms\\IDEA-projects\\homeprojects\\files\\files-installed\\Games");
        StringBuilder sb = new StringBuilder();

        String[] dirGames = { "src", "res", "savegames", "temp" };
        String[] dirSrc = {"main", "test" };
        String[] dirRes = {"drawables", "vectors", "icons"};

        for (int i = 0; i < dirGames.length; i++) {
            File directoryConstructor = new File((mainDirGames + dirGames[i]));
            if (directoryConstructor.mkdirs()) {
                System.out.println("Создана директория " + dirGames[i] + ".");
                sb.append("Создана директория " + dirGames[i] + ". \n");
            } else {
                System.err.println("Не удалось создать директорию " + dirGames[i] + ".");
                sb.append("Не удалось создать директорию " + dirGames[i] + ". \n");
            }
        }

        for (int i = 0; i < dirSrc.length; i++) {
            File directoryConstructor = new File((mainDirGames + "/src" + dirSrc[i]));
            if (directoryConstructor.mkdirs()) {
                System.out.println("Создана директория " + dirSrc[i] + ".");
                sb.append("Создана директория " + dirSrc[i] + ". \n");
            } else {
                System.err.println("Не удалось создать директорию " + dirSrc[i] + ".");
                sb.append("Не удалось создать директорию " + dirSrc[i] + ". \n");
            }
        }

        for (int i = 0; i < dirRes.length; i++) {
            File directoryConstructor = new File((mainDirGames + "/res" + dirRes[i]));
            if (directoryConstructor.mkdirs()) {
                System.out.println("Создана директория " + dirRes[i] + ".");
                sb.append("Создана директория " + dirRes[i] + ". \n");
            } else {
                System.err.println("Не удалось создать директорию " + dirRes[i] + ".");
                sb.append("Не удалось создать директорию " + dirRes[i] + ". \n");
            }
        }

        File dirSrcMainNewFile = new File("F:\\Programms\\IDEA-projects\\homeprojects\\files\\files-installed\\Games\\src\\main");

        File mainJava = new File(dirSrcMainNewFile, "Main.java");

        if (!mainJava.exists()) {
            try {
                if (mainJava.createNewFile())
                    System.out.println("Создан файл " + mainJava + ".");
                sb.append("Создан файл " + mainJava + ". \n");
            } catch (IOException ex) {
                System.err.println("Не удалось создать файл " + mainJava + ".");
            }
        } else {
            System.out.println("Файл " + mainJava + " уже существует.");
            sb.append("Файл " + mainJava + " уже существует \n");
        }


        File utilsJava = new File(dirSrcMainNewFile, "Utils.java");
        if (!utilsJava.exists()) {
            try {
                if (utilsJava.createNewFile())
                    System.out.println("Создан файл " + utilsJava + ".");
                sb.append("Создан файл " + utilsJava + ". \n");
            } catch (IOException ex) {
                System.err.println("Не удалось создать файл " + utilsJava + ".");
            }
        } else {
            System.out.println("Файл " + utilsJava + " уже существует.");
            sb.append("Файл " + utilsJava + " уже существует \n");
        }

        File dirGamesTempNewFile = new File("F:\\Programms\\IDEA-projects\\homeprojects\\files\\files-installed\\Games\\temp");

        File tempTxt = new File(dirGamesTempNewFile, "temp.txt");

        if (!tempTxt.exists()) {
            try {
                if (tempTxt.createNewFile())
                    System.out.println("Создан файл " + tempTxt + ". \n");
                sb.append("Создан файл " + tempTxt + ".");
            } catch (IOException ex) {
                System.err.println("Не удалось создать файл " + tempTxt + ".");
            }
        } else {
            System.out.println("Файл " + tempTxt + " уже существует.");
            sb.append("Файл " + tempTxt + " уже существует \n");
        }


        try (FileWriter logToFile = new FileWriter("F:\\Programms\\IDEA-projects\\homeprojects\\files\\files-installed\\Games\\temp\\temp.txt", true)) {
            logToFile.write(String.valueOf(sb));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
