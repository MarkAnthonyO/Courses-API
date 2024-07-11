package generator;

import components.Classroom;
import settings.Settings;

import java.io.*;

public class ClassroomGenerator {
    public static void generate(Classroom classroom) {
        File classroomFile = new File(Settings.getClassroomPath() + "/" + classroom.getName());

        if (classroomFile.exists()) {
            System.out.println("The classroom already exists");
            return;
        }

        try {
            FileWriter writer = new FileWriter(classroomFile);

            writer.write("[Classroom]" + "\n");
            writer.write("Name:" + classroom.getName()+ "\n");
            writer.write("Capacity:" + classroom.getCapacity() + "\n");

            writer.flush();
            writer.close();

            if (classroomFile.setReadOnly())
                System.out.println("Classroom created and insured successfully!");
            else
                System.out.println("Classroom created successfully!");

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
