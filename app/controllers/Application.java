package controllers;

import java.util.List;

import com.avaje.ebean.Model;

import model.Person;
import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import play.mvc.BodyParser.TolerantJson;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("=DDD"));
    }
    
    public Result addPerson(){
    	Person perso = Form.form(Person.class).bindFromRequest().get();
    	perso.save();
    	return redirect(routes.Application.index());
    }
    
    public Result getPeople(){
    	List<Person> people = new Model.Finder(Person.class).all();
    	return ok(Json.toJson(people));
    }

}
