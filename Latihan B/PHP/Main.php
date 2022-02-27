<?php

include "PC.php";

//membuat array objek yang dibutuhkan
$pObj = array();
$dObj = array();
$rObj = array();
$pcObj = array();

//mengisi data PC 1
$pObj[0] = new Processor();
$pObj[0]->setName("Ryzen_5_5600G");
$pObj[0]->setPrice(2999999);
$dObj[0] = new Disk();
$dObj[0]->setType("SSD");
$dObj[0]->setCapacity(512);
$dObj[0]->setPrice(850000);
$rObj[0] = new Ram();
$rObj[0]->setCapacity(16);
$rObj[0]->setPrice(1200000);
$pcObj[0] = new PC();
$pcObj[0]->setTotalPrice($pObj[0]->getPrice(), $dObj[0]->getPrice(), $rObj[0]->getPrice());

//mengisi data PC 2
$pObj[1] = new Processor();
$pObj[1]->setName("Ryzen_3_3100");
$pObj[1]->setPrice(1799999);
$dObj[1] = new Disk();
$dObj[1]->setType("SSD");
$dObj[1]->setCapacity(512);
$dObj[1]->setPrice(850000);
$rObj[1] = new Ram();
$rObj[1]->setCapacity(16);
$rObj[1]->setPrice(1100000);
$pcObj[1] = new PC();
$pcObj[1]->setTotalPrice($pObj[1]->getPrice(), $dObj[1]->getPrice(), $rObj[1]->getPrice());

//mengisi data PC 1
$pObj[2] = new Processor();
$pObj[2]->setName("Core_i3_10100F");
$pObj[2]->setPrice(1350000);
$dObj[2] = new Disk();
$dObj[2]->setType("SSD");
$dObj[2]->setCapacity(512);
$dObj[2]->setPrice(800000);
$rObj[2] = new Ram();
$rObj[2]->setCapacity(8);
$rObj[2]->setPrice(950000);
$pcObj[2] = new PC();
$pcObj[2]->setTotalPrice($pObj[2]->getPrice(), $dObj[2]->getPrice(), $rObj[2]->getPrice());

$i = 0; //iterator

echo "((Data Produk))"."<br/>";
//menampilkan data PC
for($i = 0; $i < 3; $i++){

	echo "<br/>";
	echo "========================="."<br/>";
	echo "PC ".($i+1)."<br/>";
	echo "========================="."<br/>";
	echo "-------------------------"."<br/>";
	echo "Processor"."<br/>";
	echo "----------"."<br/>";
	echo "Name     : ".$pObj[$i]->getName()."<br/>";
	echo "Price    : ".$pObj[$i]->getPrice()."<br/>";
	echo "-------------------------"."<br/>";
	echo "Disk"."<br/>";
	echo "----------"."<br/>";
	echo "Type     : ".$dObj[$i]->getType()."<br/>";
	echo "Capacity : ".$dObj[$i]->getCapacity()."<br/>";
	echo "Price    : ".$dObj[$i]->getPrice()."<br/>";
	echo "-------------------------"."<br/>";
	echo "Ram"."<br/>";
	echo "----------"."<br/>";
	echo "Capacity : ".$rObj[$i]->getCapacity()."<br/>";
	echo "Price    : ".$rObj[$i]->getPrice()."<br/>";
	echo "-------------------------"."<br/>";

	echo "Total Price: ".$pcObj[$i]->getTotalPrice();

}

?>