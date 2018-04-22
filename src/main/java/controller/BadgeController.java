package controller;

import service.BadgeService;
import bean.Badge;

public class BadgeController {
	private BadgeService badgeService;
	
	public BadgeController() {
		super();
		 badgeService = new BadgeService();
	}

	public void inserir(Badge badge){
		badgeService.add(badge);
	}
	
	public void alterar(Badge badge){
		badgeService.upd(badge);
	}
	
	public void excluir(Badge badge,int id){
		badgeService.del(badge, id);
	}
	
	public void listar(){
		badgeService.all();
	}
	
}
