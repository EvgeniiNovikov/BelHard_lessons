


@Version(version = 8.0, nameVersion = "OREO")
public class MyService
{
    private double version;
    private String nameVersion;


    public MyService(){
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getNameVersion() {
        return nameVersion;
    }

    public void setNameVersion(String nameVersion) {
        this.nameVersion = nameVersion;
    }

    @Override
    public int hashCode() {
       final int prime = 17;
       int result = 1;
       result = prime * result + ((this.getNameVersion() == null) ? 0 : this.getNameVersion().hashCode());
       result = (int) (prime * result + this.getVersion());
       return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this){
            return true;
        }
        MyService m = (MyService) obj;
        return (this.getVersion() == m.getVersion());
    }

    private void thisClassInfo(){
        System.out.println(MyService.class + " [version: " + getVersion() + ", nameVersion: " +  getNameVersion() + "]");
    }
}
