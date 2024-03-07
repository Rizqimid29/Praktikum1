package Tugas;

public class DaftarBuku {
    
    private String[][] teknologi = {{"Sapiens: A Brief History of Humanind", "Yuval Noah Harari", "464", "2014", "Harper"},
{"The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", 
"560", "2014", "Simon & Schuster"}, {"Zero to One: Notes on Startups, or How to Build the Future", "Peter Thiel with Blake Masters", 
"224", "2014", "Crown Business"}, {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", 
"400", "2015", "Ecco"}, {"Artificial Intelligence: A Guide for Thinking Humans", "Melanie Mitchell", "336", "2018", 
"Farrar, Straus and Giroux"}};

    private String[][] filsafat = {{"Being and Time (Sein und Zeit)", "Martin Heidegger", "589", "1927", "Vittorio Klostermann"}, 
{"Critique of Pure Reason (Kritik der reinen Vernunft)", "Immanuel Kant", "856", "1781", "Johann Gottfried Schulz"}, 
{"Beyond Good and Evil (Jenseits von Gut und Böse)", "Friedrich Nietzsche", "268", "1886", "Alfred Kröner Verlag"}, 
{"Simulacra and Simulation (Simulacres et Simulation)", "Jean Baudrillard", "164", "1981", "Éditions Galilée"}, 
{"Filosofi Teras", "Henry Manampiring", "346", "2018", "Kompas"}};

    private String[][] sejarah = {{"A People's History of the United States", "Howard Zinn", "729", "1980", "Harper & Row"}, 
{"The Guns of August", "Barbara W. Tuchman", "511", "1962", "Macmillan"}, {"The Silk Roads: A New History of the World", 
"Peter Frankopan", "636", "2015", "Bloomsbury"}, {"SPQR: A History of Ancient Rome", "Mary Beard", "608", "2015", "Liveright"}, 
{"A History of the World in 6 Glasses", "Tom Standage", "336", "2005", "Walker & Company"}};

    private String[][] agama = {{"The Case for Christ", "Lee Strobel", "464", "1998", "Zondervan"}, {"The God Delusion", "Richard Dawkins", 
"464", "2006", "Bantam Books"}, {"Mere Christianity", "C.S. Lewis", "175", "1952", "HarperCollins"}, {"The Tao of Pooh", "Benjamin Hoff", 
"158", "1982", "Dutton Books"}, {"The Art of Happiness", "Dalai Lama XIV dan Howard Cutler", "336", "1998", "Riverhead Books"}};

    private String[][] psikologi = {{"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011", "Farrar, Straus and Giroux"}, 
{"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "392", "2012", "Random House"}, 
{"Man's Search for Meaning", "Viktor E. Frankl", "200", "1946", "Beacon Press"}, {"Influence: The Psychology of Persuasion", 
"Robert B. Cialdini", "592", "1984", "HarperCollins"}, {"Quiet: The Power of Introverts in a World That Can't Stop Talking", 
"Susan Cain", "333", "2012", "Crown Publishing Group"}};

    private String[][] politik = {{"The Prince", "Niccolò Machiavelli", "164", "1532", "Antonio Blado d'Asola"}, {"The Road to Serfdom", 
"Friedrich Hayek", "266", "1944", "Routledge & Kegan Paul"}, {"The Audacity of Hope: Thoughts on Reclaiming the American Dream", 
"Barack Obama", "362", "2006", "Crown Publishers"}, {"Politik Kuasa Media", "Noam Chomsky", "166", "2022", "Jalan Baru Publisher"}, 
{"The Conscience of a Conservative", "Barry Goldwater", "123", "1960", "Victor Publishing Company"}};

    private String[][] fiksi = {{"Neuromancer", "William Gibson", "271", "1984", "Ace Books"}, {"Snow Crash", "Neal Stephenson", 
"480", "1992", "Bantam Books"}, {"Ready Player One", "Ernest Cline", "546", "2011", "Crown Publishing Group"}, 
{"The Circle", "Dave Eggers", "504", "2013", "Knopf"}, {"Do Androids Dream of Electric Sheep?", "Philip K. Dick", 
"210", "1968", "Doubleday"}};

public void bukuTeknologi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + teknologi[i - 1][0] 
        + "\n2. Penulis: " + teknologi[i - 1][1]
        + "\n3. Jumlah Halaman: " + teknologi[i - 1][2]
        + "\n4. Tahun Terbit: " + teknologi[i - 1][3]
        + "\n5. Penerbit: " + teknologi[i - 1][4]);
    }
}
public void bukuFilsafat() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + filsafat[i - 1][0] 
        + "\n2. Penulis: " + filsafat[i - 1][1]
        + "\n3. Jumlah Halaman: " + filsafat[i - 1][2]
        + "\n4. Tahun Terbit: " + filsafat[i - 1][3]
        + "\n5. Penerbit: " + filsafat[i - 1][4]);
    }
}
public void bukuSejarah() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + sejarah[i - 1][0] 
        + "\n2. Penulis: " + sejarah[i - 1][1]
        + "\n3. Jumlah Halaman: " + sejarah[i - 1][2]
        + "\n4. Tahun Terbit: " + sejarah[i - 1][3]
        + "\n5. Penerbit: " + sejarah[i - 1][4]);
    }
}
public void bukuAgama() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + agama[i - 1][0] 
        + "\n2. Penulis: " + agama[i - 1][1]
        + "\n3. Jumlah Halaman: " + agama[i - 1][2]
        + "\n4. Tahun Terbit: " + agama[i - 1][3]
        + "\n5. Penerbit: " + agama[i - 1][4]);
    }
}
public void bukuPsikologi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + psikologi[i - 1][0] 
        + "\n2. Penulis: " + psikologi[i - 1][1]
        + "\n3. Jumlah Halaman: " + psikologi[i - 1][2]
        + "\n4. Tahun Terbit: " + psikologi[i - 1][3]
        + "\n5. Penerbit: " + psikologi[i - 1][4]);
    }
}
public void bukuPolitik() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + politik[i - 1][0] 
        + "\n2. Penulis: " + politik[i - 1][1]
        + "\n3. Jumlah Halaman: " + politik[i - 1][2]
        + "\n4. Tahun Terbit: " + politik[i - 1][3]
        + "\n5. Penerbit: " + politik[i - 1][4]);
    }
}
public void bukuFiksi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku: " + fiksi[i - 1][0] 
        + "\n2. Penulis: " + fiksi[i - 1][1]
        + "\n3. Jumlah Halaman: " + fiksi[i - 1][2]
        + "\n4. Tahun Terbit: " + fiksi[i - 1][3]
        + "\n5. Penerbit: " + fiksi[i - 1][4]);
    }
}
}
