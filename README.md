# Movies-expert-system using Prolog
## You can run project using Swi or Netbeans

### Home Form

![fmain](https://user-images.githubusercontent.com/46052811/214041234-a2f3e6e7-e57b-4393-b8aa-326243429896.png)
 - In this form you find two buttons (search) and (similar movies). 
 - The search button opens a form that you can search for the movie you want to watch in.
 - The similar movies button opens a form to search for similar movies to the movie you want.

------------------------------------------
### Search Form

![fsearch](https://user-images.githubusercontent.com/46052811/214041313-d3fe4691-d229-46a5-b229-74cd1818ed26.png)
  - In this form you'll find checkboxes that contains the types(action,adventure,animation,family, fantasy,war,thriller,comedy,crime,drama,history, music,horror,mystery,romance) for the movies and you can check the type you want to watch.
  - You'll also find comboboxes that have options for the movie features(rating,year,duration,Language,country,age).
  - In the end a list that shows the movies depends on the options you Checked after you click on submit button, and you can get information about the film by checking it from the list ,it will show up in a new form.

------------------------------------------
### Similar movies Form

![fsimilar](https://user-images.githubusercontent.com/46052811/214041385-b987d345-1373-488e-9dfb-aca25be7c35e.png)
  - In this form you enter the name of the movie that you want to find movies like in a textfield and then you click 
Recommend button ,then the movies 'll show up in the list.

------------------------------------------
### Information Form

![fdisplay](https://user-images.githubusercontent.com/46052811/214041407-85526c12-626d-4e8b-b4d1-03a107f32548.png)
  - When we want to know information About any film just click on the name of this film and this form will be 
opened, Which include all information about this film 

------------------------------
### Clauses explanation
 - First we inserted the facts with FUNCTOR (movie) and arity=8, that contains (name(atom) , year(numeral) , type(list of pattern of 0's and 1's) , rate(numeral) , country(atom) , language(atom) , duration(numeral) , age(atom)).
 - FOR EXAMPLE: 
movie('Scarface', 1983, [1,0,0,0,1,1,0,0,0,0,0,0,0,0,0], 8.3, 'America', 'English', 170, 'NR').


 **Notice that types are ordered. 
(Action,Adventure,Animation,Comedy,Crime,Drama,Family,Fantasy,History,Horror,Music,Mystery,Romance,Thriller,War).

----
 - Then we see the rules:
	- First: we find duration rule with arity=2 that contains atom that'd refer to the duration whether it's (short(0->60 mins),mid(60->90),long(above 90)),
and a variable that 'd refer to the name of the movie, and the BODY will contain the movie clause that focuses on the name and duration only, and the condition of the duration.
	- FOR EXAMPLE:
		 duration(mid, Movie) :- movie(Movie, _, _, _, _, _, Duration, _).
		 Duration=<90, Duration>60
----

 - Second: There is find_movie rule with arity=8 that contains (Name , Year , Type , Rate , Country , Language , Duration , Age) .
 , and the BODY will contain the movie clause that focuses on all except duration, and rating condition that gets you the rating you asked for or above, and duration with arity=2 contains two variables the get the duration and the name.
 - FOR EXAMPLE:
 find_movie(Name, Year, Type, Rating, Country, Language, Duration, Age) 
		movie(Name, Year, Type, Rating1, Country, Language, _, Age),
		Rating1 >= Rating  duration(Duration, Name).
----
 - Third: There is same rule with arity=2 that contains two variables that get 2 names of 2 similar movies, and BODY contains 2 complex terms movie with arity=8 focuses on the Name(different) , Type , Age , and condition that the 2 names must be different.
 - FOR EXAMPLE: 
same(Movie, SameMovie) :- movie(Movie, _, Type, _, _, _, _, Age)
 			  movie(SameMovie, _, Type, _, _, _, _, Age),
                          Movie \= SameMovie

