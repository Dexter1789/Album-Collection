export default function Albums(albums) {
            return `

            <header>
            <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
            <nav class="nav__menu"><ul><a href="/all-albums.html"><li>Albums</li></a><a href="/all-artists.html"><li>Artists</li></a><a href="/all-songs.html"><li>Songs</li></a></ul></nav>
            <button class="menu__button"><i class="fa fa-bars"></i></button>
          </header>
          </header>
          <main class="main__wrapper">
      
          ${albums.map(album => {
              return `
            <div class="main__content">
              <div class="content__img"><img src="${album.albumImage}"></div> 
              <div class="main__text"><h2>${album.albumTitle}</h2>
              <p class="album__rating">${album.rating}</p>
              
              `;
            }).join('')}
            
            </div>
            </div>
            
            <a href="0"><h3 class="main__subtitle">Add Album</h3></a>
        </main>
          <div id="app"></div>
          <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer>

`}
           
