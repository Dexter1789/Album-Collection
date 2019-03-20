const app = document.querySelector("#app");

app.textContent = "Hello JS!";

fetch('/artists')
	.then(response => response.json())
	.then(artists => {
		let content = `<ul class="artists">`
		artists.forEach((artist) => {
			content += 
			`<li class="artist">
			<h3 class="artist__name">${artist.firstName} ${artist.lastName}</h3>
			<ul class="artist__image">${artist.artistImage}:
			<ul class="artist__age">${artist.age}: 
			<ul class="artist__hometown">${artist.hometown}: 
			<ul class="artist__rating">${artist.rating}
			<ul class="artist__album">${artist.album}:
			</li>
			</ul>
	
			`;	
			.join("")}

			
		})
		
		content += `
		<li class ="album">`
		let commentsContent = '<ul>';
		artists[0].comments.forEach(comment => {
			commentsContent += `<li>${comment.content}</li>`
		})
		commentsContent += '</ul>'
		;
		app.innerHTML = content;
	})
	.catch(err => console.log(err))