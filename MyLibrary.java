public lcass MyLibrary{	void satu()	{		//	}		void dua()	{		satu();		/** 		ini yang di sebut akses dari dalam class		*/	}		}class Turunan extends MyLibrary{	void tiga()	{		dua();		/** 		ini yang di sebut akses dari turunan(MyLibrary)		*/	}}