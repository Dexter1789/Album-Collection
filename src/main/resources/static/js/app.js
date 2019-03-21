const app = document.querySelector("#app");

app.textContent = "Hello JS!";

fetch('/artists')
	.then(response => response.json())
	.then(artists => {
		let content = `<ul class="artists">`
		artist.forEach(artist => { 
			content += `
			<li class="artist">
				<h3 class="artist__name">${artist.firstName} ${artist.lastName}</h3> 
				<img src="${artist.artistImage}" alt="Arttist Image"> 
				<h4>${artist.age}</h4> 
				<h4>${artist.hometown}</h4> 
				<h4>${artist.rating}</h4>
				<ul class="albums">
					${artist.allAlbums
						.map(album => {
							return `
							<li class="album">
								<h5 class="album__title">${album.albumTitle}<h5>
								<img src="${album.albumImage}" alt="Album Image"/>
								<h5 class="album__rating">${album.rating}</h5>
							</li>	  
						`;
						})
					.join("")}
				</ul>
			</li>
		  `;
		});
		content += `</ul>`;
		app.innerHTML = content;
	})
	.catch(err => console.log(err))