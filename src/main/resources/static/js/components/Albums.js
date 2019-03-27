export default function Albums(albums) {
            return `

            <header>
  <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
  <nav class="nav__menu">
      <ul>
          <p><li class="nav__menu__albums">Albums</li></p>
          <p><li class="nav__menu__artists">Artists</li></p>
          <p><li class="nav__menu__songs">Songs</li></p>
      </ul>
  </nav>
  <button class="menu__button"><i class="fa fa-bars"></i></button>
</header>

<main class="main__wrapper">
${albums.map(album => {
  return `
<div class="main__content">
              <div class="content__img"><img src="${album.albumImage}"></div> 
              <div class="main__text"><h2>${album.albumTitle}</h2>
              <p class="album__rating">${album.rating}</p>
              
              
              </div>
              </div>
              `;
            }).join('')}
            
           
        </main>
        <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 

`}
           
