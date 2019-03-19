const app = document.querySelector("#app");

app.textContent = "Hello JS!";

fetch('/artists')
	.then(response => response.json())
	.then(artist => {
		let content = `<ul class="artists">`
		artist.forEach((artist) => {
			// Make sure to change variable name in Java 
			content += `<li>${artist.firstName} ${artist.lastName}: 
			${artist.artistImage}: 
			${artist.age}: 
			${artist.hometown}: 
			${artist.rating}
			</li>`;
		})
		content += `</ul>`;
		app.innerHTML = content;
	})
	.catch(err => console.log(err))