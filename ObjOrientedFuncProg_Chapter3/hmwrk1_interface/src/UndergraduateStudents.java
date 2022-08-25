package hmwrk1_interface.src;

public class UndergraduateStudents extends AbstractStudents {

    private String minor;

    public UndergraduateStudents (int year,String major,String name, String minor,int no) {
        super(year, major, name,no);
        this.minor=minor;
    }
    public void register() {
        System.out.println("The Undergradute students has registered.");
    }

    @Override
    public void study() {
        System.out.println("The Undergraduate student study his lectures.");
    }

    @Override
    public boolean equals(Object o) {
        //default equals
        if (o==this) {
            return true;
        }
        //control
        if(!(o instanceof UndergraduateStudents)) {
            return false;
        }

        UndergraduateStudents m = (UndergraduateStudents) o;
        return getNo()==m.getNo();
    }

    @Override
    public int hashCode() {
        int hash=5;
        hash=31*hash+getNo();
        return hash;
    }

    @Override
    public String toString(){
        return "First name:"+getName()+"\nNumber:"+getNo()+"\nMajor:"+getMajor()+"\nHashCode:"+hashCode();
    }

    //get-set method
    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor=minor;
    }



}
