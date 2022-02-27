<?php

class Ram{

	//atribut private
	private $capacity = 0; //kapasitas ram
	private $price = 0; //harga ram


	//konstruktor
	public function __construct($capacity = 0, $price = 0){
		$this->capacity = $capacity;
		$this->price = $price;
	}

	//getter dan setter atribut capacity
	public function setCapacity($capacity){
		$this->capacity = $capacity;
	}

	public function getCapacity(){
		return $this->capacity;
	}

	//getter dan setter atribut price
	public function setPrice($price){
		$this->price = $price;
	}

	public function getPrice(){
		return $this->price;
	}

	//destruktor
	public function __destruct(){

	}

}

?>