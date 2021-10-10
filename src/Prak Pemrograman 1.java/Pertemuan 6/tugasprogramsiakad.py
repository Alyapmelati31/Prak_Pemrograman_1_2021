print("Program Siakad")
print()
print("1. Tambah Data")
print("2. Edit Data")
print("3. Hapus Data")
print("4. Lihat Data")

menu = input("Menu yang Anda pilih = ")
menu = int(menu)
if (menu == 1):
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata kuliah")
    print("3. Kembali")
    menu1 = input("Menu yang Anda pilih = ")
    menu1 = int(menu1)
    if (menu1 == 1):
        nama = input("Masukan nama Anda = ")
        print("Nama Mahasiswa yang ditambahkan adalah " + nama )
    elif (menu1 == 2):
        mataKuliah = input ("Masukan Mata Kuliah Anda = ")
        print("Mata Kuliah yang ditambahkan adalah " + mataKuliah)
    elif (menu1 == 3):
        print("Terima Kasih ")
    else:
        print("Menu Tidak Tersedia")
elif (int(menu) >=2 and int(menu) <=4 ):
    print("Fitur Belum Tersedia")
else :
    print("Menu Tidak Tersedia")        

