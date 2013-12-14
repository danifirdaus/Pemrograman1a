//Perintah Inheritance
//kelas turunannya
package Latihan02.sesi1.bin;

class Harimau extends KucingBesar
{
	//Konstruktor untuk class Harimau
	public Harimau(String namaHarimau)
	{
		//Mengisi pengubah yang diwarisi oleh class abstract
		Harimau.nama = namaHarimau;
	}
	//Implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
		System.out.println("Harimau Makan Daging");
		System.out.println();
	}
}