import Albums from './Albums'
export default function Artists(artists) {

    return `
    <h1>Before They Sold Out</h1>
    <h2>Artists</h2>

    
    <ul class="artist">
    ${artists.map(artist => {
        return `
        <li><img id="${artist.id}" class="artist__image" src="${artist.artistImage}"/></li>
        <li class="artist__name">${artist.artistName}</li>
        `;

    }).join('')}
        <section class="add-artist">
            <input type="text" class="add-artist__name" placeholder="Artist's Name">
            <input type="text" class="add-artist__image" placeholder="Artist's Image">
            <input type="text" class="add-artist__age" placeholder="Artist's Age">
            <input type="text" class="add-artist__hometown" placeholder="Artist's Hometown">
            <input type="text" class="add-artist__rating" placeholder="Artist Rating">
            <button class="add-artist__submit">Add Artist</button>
        </section>
    </ul>
    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}
