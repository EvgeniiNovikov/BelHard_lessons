public class Cinema
{
    public Theater theater;

    public Cinema(){
    }

    public void getFilmInfo() {
        theater = new Theater("Minsk, Bobruiskaya street", "Joker", "October, 3: 12:00, 14:00, 18:40");
        theater.getTheaterInfo();
    }



    private class Theater {
        private String addressTheater;
        private String film;
        private String dateFilm;

        private Theater(String addressTheater, String film, String dateFilm) {
            this.addressTheater = addressTheater;
            this.film = film;
            this.dateFilm = dateFilm;
        }

        public void getTheaterInfo() {
            System.out.println("Theater: [" + getAddressTheater() + "]\nFilm: [" + getFilm() + "]\nDate & Time: [" + getDateFilm() + "]");
        }

        public String getAddressTheater() {
            return addressTheater;
        }

        public void setAddressTheater(String addressTheater) {
            this.addressTheater = addressTheater;
        }

        public String getFilm() {
            return film;
        }

        public void setFilm(String film) {
            this.film = film;
        }

        public String getDateFilm() {
            return dateFilm;
        }

        public void setDateFilm(String dateFilm) {
            this.dateFilm = dateFilm;
        }
    }
}
