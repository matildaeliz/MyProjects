package com.example.application.views.main;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainView extends AppLayout {
	public MainView() {
		VerticalLayout layout = new VerticalLayout();
		TextField name = new TextField("Your name");
		PasswordField password = new PasswordField("Your password");
		Button login = new Button("Login");
		login.addClickListener(e -> {
			if (name.getValue().equals("admin") && password.getValue().equals("root")) {
				UI.getCurrent().navigate(GreetingView.class, QueryParameters.of("name", name.getValue()));
			} else {
				Notification.show("Wrong ID or Password");
			}
		});
		
		layout.setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER, name, password, login);
		layout.add(name, password, login);
		this.setContent(layout);
	}
}
