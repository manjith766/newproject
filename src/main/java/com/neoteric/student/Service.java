package com.neoteric.student;

public class Service {
    public float calculatePercentage(Student student){
        Subject[] subjectList = student.getSubjects();

        int totalMarks = 0, obtainedMarks = 0;

        for (Subject subject : subjectList){

            if (subject != null){
                obtainedMarks += subject.marksObtained;
                totalMarks += subject.totalMarks;
            }



        }
        if (totalMarks == 0) return 0;

        return ((float) obtainedMarks / totalMarks) * 100;


    }
}