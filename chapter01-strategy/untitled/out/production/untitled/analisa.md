Tahap 1 :
Menggunakan kelas abstrak Duck sebagai dasar untuk semua jenis bebek.
Setiap jenis bebek adalah subkelas dari Duck dan mengimplementasikan metode display() secara spesifik untuk menampilkan tampilan masing-masing jenis bebek.
Beberapa perilaku seperti quack() dan fly() diimplementasikan dalam kelas abstrak, namun dapat dioverride oleh subkelas sesuai dengan perilaku yang spesifik.
Kelemahan: Tidak ada fleksibilitas untuk mengubah perilaku bebek secara dinamis selama runtime.

Tahap 2:
Menggunakan pola desain Strategy dengan memisahkan perilaku bersuara dan terbang ke dalam interface-interface terpisah (QuackBehavior dan FlyBehavior) dan kelas-kelas konkret yang mengimplementasikannya.
Kelas abstrak Duck memiliki variabel instance untuk menyimpan perilaku bersuara dan terbang. Ini memungkinkan perilaku bebek untuk diganti atau disesuaikan secara dinamis selama runtime.
Setiap jenis bebek diinisialisasi dengan perilaku bersuara dan terbang yang sesuai dengan jenisnya.
Kelebihan: Fleksibilitas yang lebih besar dalam mengatur perilaku bebek secara dinamis, memungkinkan penambahan perilaku baru dengan mudah.

Tahap 3:
Seperti program kedua, juga menggunakan pola desain Strategy dengan memisahkan perilaku bersuara dan terbang ke dalam interface-interface terpisah.
Kelas abstrak Duck memiliki variabel instance untuk menyimpan perilaku bersuara dan terbang. Perilaku ini dapat diatur secara dinamis dengan metode setQuackBehavior() dan setFlyBehavior().
Kelebihan: Memiliki fleksibilitas yang sama dengan program kedua dalam mengatur perilaku bebek secara dinamis, namun menggunakan pendekatan yang sedikit berbeda dalam struktur kelas.