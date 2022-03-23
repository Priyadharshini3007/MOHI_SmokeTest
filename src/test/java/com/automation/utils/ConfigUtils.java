package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ConfigUtils extends DriverUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties")));
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\messages.properties")));
            System.out.println(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
    
    public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
    
    

    public class ConfigFileReader {



    public String getReportConfigPath(){
        Properties prop = new Properties();
        InputStream input = null;
        try
        {
            prop.load(getClass().getClassLoader().getResourceAsStream("C:/Users/manikandan.r/Desktop/MOHI/src/test/resources/config.properties"));
            String reportConfigPath = prop.getProperty("reportConfigPath");
            if(reportConfigPath!= null) return reportConfigPath;
            else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");        

        }
        catch (IOException io) {
            io.printStackTrace();
        }finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }    
        return null;

    }
    }
}

