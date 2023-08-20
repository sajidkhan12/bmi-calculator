package com.example.conditionallyloginscreen;


public class CourseModal {

    private String courseName;
    private String courseimg;
    private String courseMode;
    private String courseTracks;

    public CourseModal(String courseName, String courseimg, String courseMode, String courseTracks) {
        this.courseName = courseName;
        this.courseimg = courseimg;
        this.courseMode = courseMode;
        this.courseTracks = courseTracks;
    }

    // creating getter and setter methods.
    public String getCourseName() {
        return courseName;
    }

    @SuppressWarnings("unused")
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseimg() {
        return courseimg;
    }

    @SuppressWarnings("unused")
    public void setCourseimg(String courseimg) {
        this.courseimg = courseimg;
    }

    public String getCourseMode() {
        return courseMode;
    }

    @SuppressWarnings("unused")
    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }

    public String getCourseTracks() {
        return courseTracks;
    }

    @SuppressWarnings("unused")
    public void setCourseTracks(String courseTracks) {
        this.courseTracks = courseTracks;
    }
}
