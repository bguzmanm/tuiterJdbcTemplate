package cl.praxis.Tuiter.controller;

import cl.praxis.Tuiter.model.service.TuitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tuits")
public class TuitController {

  TuitService service;

  public TuitController(TuitService service) {
    this.service = service;
  }

  @GetMapping
  public String findAll(Model model){

    model.addAttribute("tuits", service.findAll());
    return "tuits";

  }

}
