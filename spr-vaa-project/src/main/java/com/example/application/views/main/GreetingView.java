package com.example.application.views.main;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

@Route(value = "/greetings", layout = MainView.class)
class GreetingView extends VerticalLayout implements BeforeEnterObserver {
	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		String name = event.getLocation().getQueryParameters().getParameters().get("name").get(0);
		Label label = new Label("Hello " + name);
		add(label);
	}
}
