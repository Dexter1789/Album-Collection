// import AllAlbums from './AllAlbums';
// import AllSongs from './AllSongs';

// export default function All(artists) {
//     return `
//     <header>
//     <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
//     <nav class="nav__menu">
//         <ul>
//             <p><li class="nav__menu__albums">Albums</li></p>
//             <p><li class="nav__menu__artists">Artists</li></p>
//             <p><li class="nav__menu__songs">Songs</li></p>
//         </ul>
//     </nav>
//     <button class="menu__button"><i class="fa fa-bars"></i></button>
//   </header>
//       <main class="main__wrapper">
//               <div class="logo__banner"><img class="logo2" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png" alt="Logo"></div>
//         <div class="main__content"><div class="content__img"><img src="https://www.popsike.com/pix/20170905/263189068682.jpg"></div>
//           <div class="main__text"><h2>Albums</h2>
//             <h3 class="main__subtitle">For Emma, Forever Ago</h3><h4>by Bon Iver</h4><article>Lorem ipsum dolor amet aesthetic cold-pressed DIY craft beer, plaid biodiesel vaporware iPhone air plant meh edison bulb hoodie scenester leggings.</article>
//             <ul>
//               <li>Top 5</li>
//     ${artists.map(artist => {
//         return `

//             <li>${AllAlbums(artist.allAlbums)}</li>
            
            
//             `;
            
//           }).join('')}
//           </ul>
    
//           </div>
//           </div>
//       <div class="main__content2">
//         <div class="content__img"><img src="https://www.treblezine.com/wp-content/uploads/2013/07/icon-ac-090412-download.jpg"></div> 
//         <div class="main__text"><h2>Artists</h2>
//         <h3 class="main__subtitle">Animal Collective</h3><article>Lorem ipsum dolor amet vexillologist lyft pok pok, health goth williamsburg typewriter tofu sartorial tumblr 90's retro truffaut disrupt PBR&B plaid. </article>
//           <ul>
//             <li>Top 5</li>
//             ${artists.map(artist => {
//               return `
      
//                   <li>${artist.artistName}</li>
                  
                  
//                   `;
                  
//                 }).join('')}
//           </ul>
//         </div>
//       </div>
//         <div class="main__content3"> 
//                   <div class="content__img"><img src="https://m.media-amazon.com/images/M/MV5BYjhhN2I4MDItZWViZi00MjNhLTkwNTctNTQ2MGRjNzY0OWQ5XkEyXkFqcGdeQXVyMTY2MzYyNzA@._V1_.jpg"></div> 
//           <div class="main__text"><h2>Songs</h2>
//             <h3 class="main__subtitle">Elephant Gun</h3><h4>by Beirut</h4><article>Lorem ipsum dolor amet before they sold out sustainable waistcoat, mlkshk migas man bun keffiyeh godard portland kickstarter tumeric tumblr. </article>
//                       <ul>
//             <li>Top 5</li>
//             ${artists.map(artist => {
//               return `
//                   <li>${AllSongs(artist.allAlbums[0].allSongs)}</li>
                  
                  
//                   `;
                  
//                 }).join('')}




//           </ul>
//           </div>
//       </div>
//   </main>

//   <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
// `;

// }

