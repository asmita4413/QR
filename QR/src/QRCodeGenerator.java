import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.image.*;


import net.glxn.qrgen.QRCode;

public class QRCodeGenerator {
	public static void main(String[] args) throws IOException {
		String s="Asmita milan together canada 2018";
		ByteArrayOutputStream out=QRCode.from(s).to((ImageType.GIF)).stream();
		File f=new File("\\Users\\milan\\Desktop\\java\\mydemo.gif");
		FileOutputStream o=new FileOutputStream(f);
		o.write(out.toByteArray());
		System.out.println("QR code is generated");
		o.flush();
		
	}

}
