/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.util;

import java.io.InputStream;
import java.util.Scanner;

public class FileUtils {

    public static String loadResource(String fileName) throws Exception {
        String result;
        try (InputStream in = Class.forName(FileUtils.class.getName()).getResourceAsStream(fileName);
            Scanner scanner = new Scanner(in, "UTF-8")) {
            result = scanner.useDelimiter("\\A").next();
        }
        return result;
    }

}