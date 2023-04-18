/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaankampus;

/**
 *
 * @author User
 */

public class PerpustakaanKampus {

    public static void main(String[] args) {
        //Terdapat database yang sudah dibuat
        Perpustakaan lib = new Perpustakaan();
        DataLogin login = new DataLogin();
        
        //database login
        Mahasiswa mhs1 = new Mahasiswa("herlin", "herlin123", "herlin priatna", "1302213018", lib, login);
        Mahasiswa mhs2 = new Mahasiswa("regy", "regy117", "regy renanda","1302213117",lib, login);                
        Mahasiswa mhs3 = new Mahasiswa("kiwil", "syahran123", "syahran syahputra", "1302210021",lib, login);
        
        Admin p1 = new Admin("regyyy", "regy1234", "regy rahman", "1302213018", lib, login);
        
        login.addAkunMahasiswa(mhs1);
        login.addAkunMahasiswa(mhs2);
        login.addAkunMahasiswa(mhs3);
        login.addAkunAdmin(p1);
        
        //database perpustakaan
        Buku buku1 = new Buku(110001, "Pengantar Teknologi Informasi", "Tata Sutabri", "teknologi", 2014, 2, "Pengantar Teknologi Informasi adalah buku yang menjelaskan tentang dasar-dasar teknologi informasi. Buku ini membahas sejarah, konsep dasar, dan aplikasi teknologi informasi dalam kehidupan sehari-hari. Dengan bahasa yang mudah dipahami, buku ini cocok sebagai pengantar bagi siapa saja yang ingin mempelajari teknologi informasi secara komprehensif.");
        Buku buku2 = new Buku(110002, "Pengantar Membuat Robot", "M. Ibnu Malik	", "teknologi", 2006, 4, "Pengantar Membuat Robot adalah buku yang membahas tentang dasar-dasar pembuatan robot. Buku ini menjelaskan tentang konsep dasar robotika, mulai dari pemilihan komponen, perakitan, hingga pemrograman robot. Dilengkapi dengan ilustrasi dan panduan praktis, buku ini cocok sebagai pengantar bagi siapa saja yang ingin mempelajari cara membuat robot secara sederhana dan mudah dipahami. Buku ini juga bisa menjadi panduan bagi mahasiswa atau hobiis yang ingin belajar robotika sebagai awal sebelum mempelajari konsep yang lebih kompleks.");
        Buku buku3 = new Buku(110003, "Pemrograman Web Membuat Sistem Informasi Akademik Sekolah Dengan PHP-MYSQL & Dreamweaver", "Bunafit Nugroho", "teknologi", 2014, 4, "Buku Pemrograman Web Membuat Sistem Informasi Akademik Sekolah dengan PHP-MySQL & Dreamweaver adalah buku panduan yang membahas tentang pembuatan sistem informasi akademik berbasis web. Buku ini menjelaskan cara membangun sistem informasi akademik menggunakan bahasa pemrograman PHP dan database MySQL dengan bantuan aplikasi pengembangan web Dreamweaver. Buku ini dilengkapi dengan tutorial praktis, mulai dari konsep dasar pemrograman web, desain basis data, hingga integrasi sistem ke dalam website. Cocok bagi pelajar, mahasiswa, atau pengembang web yang ingin mempelajari cara membuat sistem informasi akademik berbasis web secara mudah dan terarah.");
        Buku buku4 = new Buku(110004, "Panduan Praktis Sistem Kendali Digital", "Azwardi Dan Cekmas Cekdin", "teknologi", 2015, 2, "Panduan Praktis Sistem Kendali Digital adalah buku yang membahas tentang konsep dasar dan aplikasi praktis sistem kendali digital. Buku ini menjelaskan tentang prinsip kerja dan komponen sistem kendali digital, mulai dari rangkaian dasar, pengaturan input/output, hingga pemrograman mikrokontroler. Dilengkapi dengan contoh aplikasi dan tutorial praktis, buku ini cocok bagi mahasiswa, teknisi, atau hobiis elektronika yang ingin mempelajari sistem kendali digital secara komprehensif dan mudah dipahami. Buku ini juga memberikan panduan praktis bagi pembaca yang ingin merancang dan membuat berbagai sistem kendali digital, seperti robot, sistem keamanan, atau otomasi industri.");
        Buku[] bukuTeknologi = {buku1,buku2,buku3,buku4};
        Rak teknologi = new Rak("Teknologi","11");
        teknologi.tambahBuku(bukuTeknologi);
        
        lib.tambahRak(teknologi);
        
        Buku buku6 = new Buku(120001, "PENDIDIKAN PASCAKONFLIK ; Pendidikan Multikultural Berbasis Konseling Budaya Masyarakat Maluku Utara", "Dr. M. Tahir Sapsuha","pendidikan", 2013, 3, "Buku Pendidikan Pascakonflik: Pendidikan Multikultural Berbasis Konseling Budaya Masyarakat Maluku Utara adalah buku yang membahas tentang upaya memperbaiki situasi pendidikan pasca konflik di wilayah Maluku Utara. Buku ini mengusung pendekatan pendidikan multikultural berbasis konseling budaya untuk membantu anak-anak dan remaja yang mengalami dampak konflik untuk tumbuh dan berkembang secara positif dalam lingkungan yang harmonis dan inklusif. Buku ini menjelaskan tentang teori dan konsep dasar konseling budaya, serta cara mengimplementasikan program pendidikan multikultural dalam lingkungan sekolah. Dilengkapi dengan studi kasus dan panduan praktis, buku ini cocok bagi guru, konselor, psikolog, atau siapa saja yang tertarik untuk mempelajari cara membantu anak-anak dan remaja pasca konflik untuk mencapai kesejahteraan psikologis dan akademik.");
        Buku buku7 = new Buku(120002, "Menulis Itu Mudah ; Panduan Praktis Menjadi Penulis Handal", "Sukino", "pendidikan", 2010, 3, "Menulis Itu Mudah: Panduan Praktis Menjadi Penulis Handal adalah buku yang memberikan panduan praktis bagi pembaca yang ingin menjadi penulis yang handal. Buku ini membahas berbagai teknik dan strategi menulis, mulai dari ide-ide kreatif, teknik penulisan, hingga pemasaran karya tulis. Dilengkapi dengan contoh-contoh yang inspiratif dan latihan-latihan praktis, buku ini cocok bagi para penulis pemula yang ingin meningkatkan kemampuan menulisnya, maupun bagi penulis yang sudah berpengalaman yang ingin mengasah kembali keterampilan menulisnya. Buku ini akan membantu pembaca untuk memahami teknik-teknik menulis yang efektif dan mengajarkan bagaimana cara menghasilkan karya yang menarik perhatian dan mendapat apresiasi dari pembaca.");
        Buku buku8 = new Buku(120003, "Langkah Mudah Belajar Kalkulus For IT(Khusus P. Jawa)", "Sudaryono, Untung Rahardja, Edi S. Mulyanta", "pendidikan", 2012, 5, "Langkah Mudah Belajar Kalkulus For IT (Khusus P. Jawa) adalah buku panduan yang membahas tentang konsep dasar kalkulus khususnya untuk pembaca yang berbahasa Jawa. Buku ini membantu pembaca untuk memahami konsep kalkulus secara mendalam melalui pembahasan yang ringkas dan mudah dipahami. Buku ini dilengkapi dengan latihan-latihan yang bertingkat kesulitan dan juga penjelasan menggunakan bahasa Jawa yang akan membantu pembaca yang lebih nyaman belajar menggunakan bahasa tersebut. Cocok bagi mahasiswa atau siapa saja yang ingin mempelajari kalkulus secara mudah dan jelas, terutama yang membutuhkan materi dalam bahasa Jawa. Buku ini memberikan pemahaman yang baik tentang kalkulus dan membantu pembaca untuk meningkatkan kemampuan matematika untuk aplikasi IT.");
        Buku buku9 = new Buku(120004, "DESAIN PEMBELAJARAN BERBASIS PENDIDIKAN KARAKTER", "Asmaun Sahlan & Angga Teguh Prastyo", "pendidikan", 2016, 3, "Desain pembelajaran yang berfokus pada pendidikan karakter mempertimbangkan pembentukan nilai dan sikap positif pada peserta didik. Pendidikan karakter yang berbasis pada kejujuran, tanggung jawab, kerja sama, dan kreativitas diintegrasikan dalam setiap kegiatan pembelajaran untuk menciptakan lingkungan belajar yang kondusif dan mendukung perkembangan karakter peserta didik.");
        Buku buku10 = new Buku(120005, "Belajar mikrokontroler AT89C51/52/55", "Agfianto EP", "pendidikan", 2010, 4, "Buku Belajar Mikrokontroler AT89C51/52/55 memberikan penjelasan detail tentang penggunaan mikrokontroler dalam aplikasi elektronik. Melalui pembahasan langkah demi langkah, pembaca dapat memahami cara kerja, kelebihan, dan fitur dari mikrokontroler AT89C51/52/55. Buku ini cocok bagi pembaca yang ingin mengembangkan keahlian dalam bidang elektronik dan teknologi.");
        Buku[] bukuPendidikan = {buku6,buku7,buku8,buku9,buku10};
        Rak pendidikan = new Rak("Pendidikan","12");
        pendidikan.tambahBuku(bukuPendidikan);
        
        lib.tambahRak(pendidikan);
        
        //mulai sebagai guest
        Guest g1 = new Guest(lib,login);
        g1.menuUtama();
        System.out.println("Akhir program");
    }
}
