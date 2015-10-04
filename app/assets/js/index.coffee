$ ->
	$.get "/people", (people) ->
		$.each people, (index, person) ->
			$('#people').append $("<li>").text person.name