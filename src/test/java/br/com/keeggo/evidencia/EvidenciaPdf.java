package br.com.keeggo.evidencia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class EvidenciaPdf implements ReportsPDF {
	
	private Document arquivoPDF;
	private String caminho = "//reports/relatorioPDF.pdf";
	
	public void gerarPDF() {
		this.arquivoPDF = new Document();
		try {
			PdfWriter.getInstance(this.arquivoPDF, new FileOutputStream(this.caminho));
			this.arquivoPDF.open();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void gerarCabecalho() {
		Paragraph titulo = new Paragraph();
//		titulo.set
		
	}

	@Override
	public void gerarCorpo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gerarRodape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	
}
