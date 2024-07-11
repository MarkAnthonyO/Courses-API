package settings;

import java.io.File;

public class Settings {

    private static final File projectPath = new File(System.getProperty("user.home") + "/Courses/");
    private static final File studentsPath = new File(projectPath.getPath() + "/Students/");
    private static final File classroomPath = new File(projectPath.getPath() + "/Classroom/");

    public static File getProjectPath() {
        if(!projectPath.exists())
            projectPath.mkdirs();

        return projectPath;
    }

    public static File getStudentsPath() {
        if(!studentsPath.exists())
            studentsPath.mkdirs();
        return studentsPath;
    }

    public static File getClassroomPath() {
        if(!classroomPath.exists())
            classroomPath.mkdirs();
        return classroomPath;
    }
}
