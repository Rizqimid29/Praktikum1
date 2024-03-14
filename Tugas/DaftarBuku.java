package Tugas;

public class DaftarBuku {

    public String[][] teknologi;
    public String[][] filsafat;
    public String[][] sejarah;
    public String[][] agama;
    public String[][] psikologi;
    public String[][] politik;
    public String[][] fiksi;
    int sinopsis;
    
public DaftarBuku() {
    teknologi = new String[][] {{"Sapiens: A Brief History of Humanind", "Yuval Noah Harari", "464", "2014", "Harper", "Terdapat enam spesies manusia penghuni bumi. Dan pada hari ini hanya terdapat satu. Kita, Homo Sapiens"},
    {"The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", "560", "2014", "Simon & Schuster", "Orang-orang dan penemuan terpenting yang mengarah pada cara kita menggunakan teknologi saat ini"}, 
    {"Zero to One: Notes on Startups, or How to Build the Future", "Peter Thiel with Blake Masters", "224", "2014", "Crown Business", "Cara membangun sebuah perusahaan startup sukses yang mampu menjawab tantangan masa depan "}, 
    {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "400", "2015", "Ecco", "Kehidupan dan masa-masa luar biasa dari pengusaha paling berani di Silicon Valley"}, 
    {"Artificial Intelligence: A Guide for Thinking Humans", "Melanie Mitchell", "336", "2018", "Farrar, Straus and Giroux", "Memperkenalkan model dominan AI dan pembelajaran mesin modern dan alur pemikiran historis "}};

    filsafat = new String[][] {{"Being and Time (Sein und Zeit)", "Martin Heidegger", "589", "1927", "Vittorio Klostermann", "Menantang asumsi-asumsi filsafat tradisional dan memberikan wawasan baru tentang makna keberadaan"}, 
    {"Critique of Pure Reason (Kritik der reinen Vernunft)", "Immanuel Kant", "856", "1781", "Johann Gottfried Schulz", "Menetapkan batas-batas pengetahuan manusia dan menyoroti kemungkinan keterbatasan pengetahuan manusia"}, 
    {"Beyond Good and Evil (Jenseits von Gut und Böse)", "Friedrich Nietzsche", "268", "1886", "Alfred Kröner Verlag", "Kritik terhadap moralitas tradisional, tetapi juga memberikan pandangan alternatif tentang kehidupan"}, 
    {"Simulacra and Simulation (Simulacres et Simulation)", "Jean Baudrillard", "164", "1981", "Éditions Galilée", "Menantang dan provokatif yang mengajukan pertanyaan-pertanyaan penting tentang sifat realitas dalam era modern"}, 
    {"Filosofi Teras", "Henry Manampiring", "346", "2018", "Kompas", "Pemikiran-pemikiran filsafat yang mendasar, seperti hakikat keberadaan dengan bahasa yang sederhana dan lugas"}};

    sejarah = new String[][] {{"A People's History of the United States", "Howard Zinn", "729", "1980", "Harper & Row", "Menghadirkan sejarah Amerika Serikat dari sudut pandang yang berbeda, menyoroti pengalaman dan perjuangan"}, 
    {"The Guns of August", "Barbara W. Tuchman", "511", "1962", "Macmillan", "Peristiwa-peristiwa yang mengarah pada pecahnya Perang Dunia Pertama dan tindakan-tindakan yang membentuk jalannya sejarah dunia "}, 
    {"The Silk Roads: A New History of the World", "Peter Frankopan", "636", "2015", "Bloomsbury", "Menawarkan pandangan yang lebih luas tentang sejarah dunia dengan menggambarkan peran sentral Jalur-Jalur Sutra"}, 
    {"SPQR: A History of Ancient Rome", "Mary Beard", "608", "2015", "Liveright", "Gambaran menyeluruh tentang sejarah Roma Kuno, mulai dari awalnya sebagai sebuah kota kecil hingga menjadi sebuah kekaisaran "}, 
    {"A History of the World in 6 Glasses", "Tom Standage", "336", "2005", "Walker & Company", "Menggambarkan bagaimana minuman telah memainkan peran yang sangat penting dalam membentuk peradaban manusia"}};

    agama = new String[][] {{"The Case for Christ", "Lee Strobel", "464", "1998", "Zondervan", "Merangsang pemikiran dan mempresentasikan bukti-bukti yang kuat tentang kebenaran keyakinan Kristen"}, 
    {"The God Delusion", "Richard Dawkins", "464", "2006", "Bantam Books", "Mendorong pembaca untuk mempertimbangkan skeptisisme rasional terhadap keyakinan agama dan untuk memahami dunia melalui lensa ilmiah"}, 
    {"Mere Christianity", "C.S. Lewis", "175", "1952", "HarperCollins", "Menyajikan argumen-argumen yang kuat untuk iman Kristen dengan cara yang logis, sederhana, dan mendalam"}, 
    {"The Tao of Pooh", "Benjamin Hoff", "158", "1982", "Dutton Books", "Memahami prinsip-prinsip Taoisme dan bagaimana menerapkan ajarannya dalam kehidupan sehari-hari"}, 
    {"The Art of Happiness", "Dalai Lama XIV dan Howard Cutler", "336", "1998", "Riverhead Books", "Menyajikan gagasan-gagasan dari ajaran Buddhis Tibet dan bagaimana menerapkannya dalam konteks kehidupan modern\r\n"}};

    psikologi = new String[][] {{"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011", "Farrar, Straus and Giroux", "Mengungkap dua sistem berpikir manusia: sistem otomatis, cepat, dan emosional; serta sistem reflektif, lambat"}, 
    {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "392", "2012", "Random House", "Mekanisme pembentukan kebiasaan, serta bagaimana kita dapat mengubah kebiasaan-kebiasaan kita untuk mencapai kesuksesan dalam kehidupan dan bisnis"}, 
    {"Man's Search for Meaning", "Viktor E. Frankl", "200", "1946", "Beacon Press", "Membahas pengalaman penderitaannya di kamp konsentrasi Nazi dan bagaimana ia menemukan makna dalam kehidupan"}, 
    {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "592", "1984", "HarperCollins", "Cialdini membantu pembaca memahami bagaimana orang lain dapat memengaruhi perilaku mereka"}, 
    {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "333", "2012", "Crown Publishing Group", "Membahas bagaimana introvert dapat berkontribusi secara positif dalam berbagai konteks"}};

    politik = new String[][] {{"The Prince", "Niccolò Machiavelli", "164", "1532", "Antonio Blado d'Asola", "Membahas strategi politik dan kekuasaan, dengan penekanan pada kebijaksanaan dan kekuatan sebagai cara untuk mempertahankan kekuasaan"}, 
    {"The Road to Serfdom", "Friedrich Hayek", "266", "1944", "Routledge & Kegan Paul", "Bahaya dari ekspansi pemerintah yang terlalu besar dan intervensi ekonomi yang berlebihan"}, 
    {"The Audacity of Hope: Thoughts on Reclaiming the American Dream", "Barack Obama", "362", "2006", "Crown Publishers", "Mengeksplorasi berbagai isu politik, sosial, dan ekonomi yang dihadapi Amerika Serikat"}, 
    {"Politik Kuasa Media", "Noam Chomsky", "166", "2022", "Jalan Baru Publisher", "Memperdalam pemahaman tentang hubungan antara media dan politik, serta implikasinya terhadap proses politik dan demokrasi"}, 
    {"The Conscience of a Conservative", "Barry Goldwater", "123", "1960", "Victor Publishing Company", "Membahas prinsip-prinsip konservatif, termasuk kebebasan individual, pemerintah terbatas, dan ekonomi pasar bebas"}};

    fiksi = new String[][] {{"Neuromancer", "William Gibson", "271", "1984", "Ace Books", "Case dipekerjakan oleh seorang penjahat untuk melakukan serangkaian kejahatan siber yang rumit"}, 
    {"Snow Crash", "Neal Stephenson", "480", "1992", "Bantam Books", "Seorang pengendara pengiriman bernama Hiro Protagonist yang terlibat dalam penyelidikan kejahatan siber yang mematikan"}, 
    {"Ready Player One", "Ernest Cline", "546", "2011", "Crown Publishing Group", "Mengambil setting di masa depan dystopian di mana sebagian besar manusia melarikan diri ke dalam sebuah dunia virtual yang disebut OASIS"}, 
    {"The Circle", "Dave Eggers", "504", "2013", "Knopf", "Kisah seorang wanita bernama Mae Holland yang mendapat pekerjaan di perusahaan teknologi raksasa bernama The Circle"}, 
    {"Do Androids Dream of Electric Sheep?", "Philip K. Dick", "210", "1968", "Doubleday", "Seorang pemburu android bernama Rick Deckard yang ditugaskan untuk \"pensiun\" sekelompok android yang melarikan diri ke Bumi"}};
}

public void bukuTeknologi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + teknologi[i - 1][0] 
        + "\n2. Penulis\t\t: " + teknologi[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + teknologi[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + teknologi[i - 1][3]
        + "\n5. Penerbit\t\t: " + teknologi[i - 1][4]
        + "\n6. Sinopsis\t\t: " + teknologi[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(teknologi[i - 1][5]));
    
    }
}
public void bukuFilsafat() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + filsafat[i - 1][0] 
        + "\n2. Penulis\t\t: " + filsafat[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + filsafat[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + filsafat[i - 1][3]
        + "\n5. Penerbit\t\t: " + filsafat[i - 1][4]
        + "\n6. Sinopsis\t\t: " + filsafat[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(filsafat[i - 1][5]));
    }
}
public void bukuSejarah() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + sejarah[i - 1][0] 
        + "\n2. Penulis\t\t: " + sejarah[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + sejarah[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + sejarah[i - 1][3]
        + "\n5. Penerbit\t\t: " + sejarah[i - 1][4]
        + "\n6. Sinopsis\t\t: " + sejarah[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(sejarah[i - 1][5]));
    }
}
public void bukuAgama() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + agama[i - 1][0] 
        + "\n2. Penulis\t\t: " + agama[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + agama[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + agama[i - 1][3]
        + "\n5. Penerbit\t\t: " + agama[i - 1][4]
        + "\n6. Sinopsis\t\t: " + agama[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(agama[i - 1][5]));
    }
}
public void bukuPsikologi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + psikologi[i - 1][0] 
        + "\n2. Penulis\t\t: " + psikologi[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + psikologi[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + psikologi[i - 1][3]
        + "\n5. Penerbit\t\t: " + psikologi[i - 1][4]
        + "\n6. Sinopsis\t\t: " + psikologi[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(psikologi[i - 1][5]));
    }
}
public void bukuPolitik() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + politik[i - 1][0] 
        + "\n2. Penulis\t\t: " + politik[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + politik[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + politik[i - 1][3]
        + "\n5. Penerbit\t\t: " + politik[i - 1][4]
        + "\n6. Sinopsis\t\t: " + politik[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(politik[i - 1][5]));
    }
}
public void bukuFiksi() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("\nBuku ke-" + i);
        System.out.println("1. Nama Buku\t\t: " + fiksi[i - 1][0] 
        + "\n2. Penulis\t\t: " + fiksi[i - 1][1]
        + "\n3. Jumlah Halaman\t: " + fiksi[i - 1][2]
        + "\n4. Tahun Terbit\t\t: " + fiksi[i - 1][3]
        + "\n5. Penerbit\t\t: " + fiksi[i - 1][4]
        + "\n6. Sinopsis\t\t: " + fiksi[i - 1][5]
        + "\n7. Jumlah Kata\t\t: " + HitungJumlahKata(fiksi[i - 1][5]));
    }
}
public int HitungJumlahKata(String sinopsis) {
    String[] kataArray = sinopsis.split("\\s+");
    return kataArray.length;
}
}

