'use client';

import Link from 'next/link';
import { Search, ShoppingBag, User } from 'lucide-react';

export default function Navbar() {
  return (
    <nav className="sticky top-0 z-50 bg-white border-b">
      <div className="max-w-7xl mx-auto px-6 py-4 flex items-center justify-between">
        
        {/* Logo */}
        <Link
          href="/"
          className="text-2xl font-extrabold text-black tracking-wide"
        >
          BEAUTY
        </Link>

        {/* Search */}
        <div className="hidden md:flex items-center gap-2 border border-gray-300 px-3 py-2 rounded-md w-1/2 bg-gray-50">
          <Search size={18} className="text-gray-600" />
          <input
            type="text"
            placeholder="Search products..."
            className="w-full outline-none text-sm bg-transparent text-black"
          />
        </div>

        {/* Icons */}
        <div className="flex items-center gap-6 text-black">
          <User size={22} className="cursor-pointer" />
          <ShoppingBag size={22} className="cursor-pointer" />
        </div>
      </div>
    </nav>
  );
}
