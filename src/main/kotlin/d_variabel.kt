fun main() {
    fun main(args: Array<String>) {
        /* variabel adalah sebuah tempat atau wadah dialam memori komputer untuk menyimpan data sepwerti data namapengguna,
        kata sandi, data waktu, jumlah makanan dan lain-lain.
        */

        //dinamic variabel tidak memerlukan adanya deklarasi tipe data pada sebuah variabel
        var dynamicVar = 2
        println("Contoh dynamic variabel = " + dynamicVar)

        /*statis variabel mengharuskan kita mendeklarasikan jenis tipe data tertentu dalam sebuah variabel
        dan variabel tipe data tersebut tidak bisa d ubah selama program diekseskusi.
        */
        var staticVar: Char = 'A'
        println("Contoh static variabel = " + staticVar)
    }
}