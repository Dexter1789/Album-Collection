import Albums from './Albums'

export default function Artists(artists) {
    return `
        <ul class="artist">
        ${artists.map(artist => {
        return `
            <h3 class="artist__name">${artist.firstName} ${artist.lastName}</h3>
            <img class="artist__image" src="${artist.artistImage}"/>
            <p class="artist__age">${artist.age}</p>
            <p class="artist__hometown">${artist.hometown}</p>
            <p class="artist__rating">${artist.rating}</p>
            </li>
        `;


    }).join('')}
    </ul>
    <section class="add-artist">
    <input type="text" class="add-artist__first-name" placeholder="Artist's First Name">
    <input type="text" class="add-artist__last-name" placeholder="Artist's Last Name">
    <input type="text" class="add-artist__image" placeholder="Artist's Image">
    <input type="text" class="add-artist__age" placeholder="Artist's Age">
    <input type="text" class="add-artist__hometown" placeholder="Artist's Hometown">
    <input type="text" class="add-artist__rating" placeholder="Artist Rating">
    <button class="add-artist__submit">Add Artist</button>
    </section>
    `;

}

