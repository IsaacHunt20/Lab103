/**
 * Simple course class
 * @author isaac huntington
 * @version 20230207
 */
public class Course 
{
    private String courseId;
    
    /**
     *
     * @param course
     */
    public Course(String course)
    {
        courseId = course;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() 
    {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }
    
    /**
     *
     * @param o object to compare
     * @return true if same data false if not 
     */
    public boolean equals(Object o)
    {
        if ( !( o instanceof Course ) )
            return false;
        
       Course c = ( Course ) o;
        
        return courseId.equals(c.getCourseId());
       
    }
    
    /**
     *
     * @return the instances data in a string 
     */
    public String toString(){
        return getClass().getName() + "@" + courseId;
    }
    
}
