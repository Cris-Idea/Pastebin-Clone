package com.cristian.nc.pastebin_clone;

import com.cristian.nc.pastebin_clone.entities.Paste;
import com.cristian.nc.pastebin_clone.repositories.PasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.lang.instrument.Instrumentation;

@SpringBootApplication
public class PastebinCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PastebinCloneApplication.class, args);
	}

}

@Component
class TempCommandLineRunner implements CommandLineRunner {

	@Autowired
	private PasteRepository pasteRepository;

	@Override
	public void run(String... args) throws Exception {

		Paste one = new Paste();
		one.setPasteName("One");
		one.setExposure("Public");
		one.setBurnAfterRead(true);
		one.setExpiration(3660);
		one.setPasteText("@Table(name=\"paste\")\n" +
				"public class Paste {\n" +
				"\n" +
				"    @Id\n" +
				"    @GeneratedValue(strategy = GenerationType.AUTO)\n" +
				"    private long pasteId;\n" +
				"\n" +
				"    private String pasteName;\n" +
				"\n" +
				"    private Date pasteInstanceMoment = new Date( );\n" +
				"\n" +
				"    @Column(name = \"ft\", columnDefinition = \"LONGTEXT\")\n" +
				"    private SimpleDateFormat ft = new SimpleDateFormat(\"dd.MM.yyyy\");\n" +
				"    private String pasteInstanceMomentString = ft.format(pasteInstanceMoment); //new Date();\n" +
				"\n");

		pasteRepository.save(one);

		Paste two = new Paste();
		two.setPasteName("Two");
		two.setExposure("Public");
		two.setBurnAfterRead(true);
		two.setPasswordStatus(true);
		two.setExpiration(720);
		two.setPasteText(" @Controller\n" +
				"@RequestMapping(\"/view_selection1\")\n" +
				"public class ViewSelectionController {\n" +
				"    private final PasteService pasteService;\n" +
				"\n" +
				"    public ViewSelectionController(PasteService pasteService) {\n" +
				"        this.pasteService = pasteService;\n" +
				"    }\n" +
				"\n" +
				"    @GetMapping(value = \"/{id}\")\n" +
				"    public String getSelectedPaste(@PathVariable(value = \"id\") long id, Model model){\n" +
				"        model.addAttribute(\"pastes\", this.pasteService.getSelectedPaste(id));\n" +
				"        return \"/view_selection\";\n" +
				"    }\n" +
				"    @GetMapping\n" +
				"    public String getAllPastes( Model model){\n" +
				"        model.addAttribute(\"pastes\", this.pasteService.getAllPastes());\n" +
				"        return \"/view_selection\";\n" +
				"    }\n ");

		pasteRepository.save(two);
	}
}
