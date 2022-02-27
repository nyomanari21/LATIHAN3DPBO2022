<?php

class Disk{

	//atribut private
	private $type = ""; //tipe disk
	private $capacity = 0; //kapasitas disk
	private $price = 0; //harga disk


	//konstruktor
	public function __construct($type = "", $capacity = 0, $price = 0){
		$this->type = $type;
		$this->capacity = $capacity;
		$this->price = $price;
	}

	//getter dan setter atribut type
	public function setType($type){
		$this->type = $type;
	}

	public function getType(){
		return $this->type;
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