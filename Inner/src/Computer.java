public class Computer
{
    private SystemSpec sys;

    private class SystemSpec
    {
        String os;
        int ram;
        String processor;

        private SystemSpec(String os, int ram, String processor) {
            this.os = os;
            this.ram = ram;
            this.processor = processor;
        }
        public void getInfo(){
            System.out.println("OS: " + this.os + "\nRAM: " + this.ram + " Gb\nProcessor: " + processor);
        }
    }

    public void compInfo() {
        sys = new SystemSpec("Windows", 16, "Intel Core i7");
        sys.getInfo();
    }

}
