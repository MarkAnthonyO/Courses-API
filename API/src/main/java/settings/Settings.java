package settings;

import java.io.File;

public class Settings {

    private static final File contactsPath = new File(System.getProperty("user.home") + "/Courses/");

    public static File getContactsPath() {
        if(!contactsPath.exists()) contactsPath.mkdirs();
        return contactsPath;
    }
}
