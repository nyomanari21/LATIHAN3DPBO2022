<?php

include "Processor.php";
include "Disk.php";
include "Ram.php";

class PC{

	//atribut private
	private $pObj; //data prosesor
	private $dObj; //data disk
	private $rObj; //data ram
	private $totalPrice; //total harga pc


	//konstruktor
	public function __construct(){
		$this->pObj = new Processor();
		$this->dObj = new Disk();
		$this->rObj = new Ram();
		$this->totalPrice = 0;
	}

	//getter dan setter atribut pObj
	public function setProcessor($pObj){
		$this->pObj = $pObj;
	}

	public function getProcessor(){
		return $this->pObj;
	}

	//getter dan setter atribut dObj
	public function setDisk($dObj){
		$this->dObj = $dObj;
	}

	public function getDisk(){
		return $this->dObj;
	}

	//getter dan setter atribut rObj
	public function setRam($rObj){
		$this->rObj = $rObj;
	}

	public function getRam(){
		return $this->rObj;
	}

	//getter dan setter atribut totalPrice
	public function setTotalPrice($p1, $p2, $p3){
		$this->totalPrice = $p1+$p2+$p3;
	}

	public function getTotalPrice(){
		return $this->totalPrice;
	}

	//destruktor
	public function __destruct(){

	}

}

?>