
export default function Albums(albums) {

            return `
<h1>Before They Sold Out</h1>
<h2>Albums</h2>

<section class="add-album">
  <input type="text" class="add-album__title" placeholder="Album Title">
  <input type="text" class="add-album__image" placeholder="Album Image">
  <input type="text" class="add-album__rating" placeholder="Album Rating">
  <input type="text" class="add-album__artist" placeholder="Album Artist">
  <button class="add-album__submit">Add Album</button>
</section>

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
           




