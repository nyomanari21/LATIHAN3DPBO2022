<?php

class Processor{

	//atribut private
	private $name = ""; //nama prosesor
	private $price = 0; //harga prosesor


	//konstruktor
	public function __construct($name = "", $price = 0){
		$this->name = $name;
		$this->price = $price;
	}

	//getter dan setter atribut name
	public function setName($name){
		$this->name = $name;
	}

	public function getName(){
		return $this->name;
	}

	//getter dan setter atribut name
	public function setPrice($price){
		$this->price = $price;
	}

	public function getPrice(){
		return $this->price;
	}

}

?>