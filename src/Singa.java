//Perintah Inheritance
//kelas turunannya
package Latihan02.sesi1.bin;

class Singa extends KucingBesar
{
	//Konstruktor untuk class Singa
	public Singa(String namaSinga)
	{
		//Mengisi pengubah yang diwarisi oleh class abstract
		Singa.nama = namaSinga;
	}
	//Implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
		System.out.println("Singa Makan Daging");
		System.out.println();
	}
}