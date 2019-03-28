export default function Songs(songs) {
    return `

    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    </header>
  <main class="main__wrapper">

  ${songs.map(song => {
      return `
    <div class="main__content">
      <div class="main__text"><h2>${song.songTitle}</h2>
      <p class="song__duration">${song.duration}</p>
      <p class="song__rating">Average Rating:${song.rating}</p>
      
      `;
    }).join('')}
    
    </div>
    </div>
    
    <a href="0"><h3 class="main__subtitle">Add Song</h3></a>
</main>
<section class="add-artist">
<input type="text" class="add-song__title" placeholder="Song Title">
<input type="text" class="add-song__duration" placeholder="Song Duration">
<input type="text" class="add-song__rating" placeholder="Song Rating">
<input type="text" class="add-song__album" placeholder="Song Album">
<button class="add-song__submit">Add Song</button>
</section>


`}