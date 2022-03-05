package com.cristian.nc.pastebin_clone.web;

import com.cristian.nc.pastebin_clone.dto.PasteDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pastebinclone")
public class PasteController {
    private final PasteService pasteService;

    public PasteController(PasteService pasteService) {
        this.pasteService = pasteService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPastes(Model model) {
        model.addAttribute("pastes", this.pasteService.getAllPastes());
        return "pastes";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addPaste1(@ModelAttribute(value="paste") PasteDTO pasteNew, Model model) {
        pasteService.addPaste(pasteNew);
        model.addAttribute("pastes", this.pasteService.getAllPastes());
        return "pastes";
    }
}
