
package com.mycompany.proyectoparqueo;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CrearPDF {

    public static void generarPDF(String ticket, String placa, String area, String spot, String fechaHora) {
        try (PDDocument documento = new PDDocument()) {

            PDPage pagina = new PDPage();
            documento.addPage(pagina);

            PDPageContentStream stream = new PDPageContentStream(documento, pagina);

            stream.beginText();
            stream.setFont(PDType1Font.TIMES_ROMAN, 16);
            stream.newLineAtOffset(50, 750);

            stream.showText("TICKET DE ENTRADA");
            stream.setFont(PDType1Font.TIMES_ROMAN, 12);

            stream.newLineAtOffset(0, -30);
            stream.showText("Ticket: " + ticket.toUpperCase());

            stream.newLineAtOffset(0, -20);
            stream.showText("Placa: " + placa.toUpperCase());

            stream.newLineAtOffset(0, -20);
            stream.showText("Área: " + area.toUpperCase());

            stream.newLineAtOffset(0, -20);
            stream.showText("Spot: " + spot.toUpperCase());

            stream.newLineAtOffset(0, -20);
            stream.showText("Fecha/Hora Ingreso: " + fechaHora);

            stream.endText();
            stream.close();

            documento.save("Ticket-" + ticket + ".pdf");
            documento.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

